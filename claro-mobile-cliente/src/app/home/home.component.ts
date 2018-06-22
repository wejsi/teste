import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { FormGroup, FormControl, Validators, FormBuilder }  from '@angular/forms';

import { DataService } from '../services/data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  private celulares = [];
  private isLoading = true;

  private celular = {};

  private inserirCelularForm: FormGroup;
  private model = new FormControl("", Validators.required);
  private price = new FormControl("", Validators.required);
  private brand = new FormControl("", Validators.required);
  private photo = new FormControl("", Validators.required);
  private date = new FormControl("", Validators.required);

  private infoMsg = { body: "", type: "info"};

  constructor(private http: Http,
              private dataService: DataService,
              private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.getCelulares();

    this.inserirCelularForm = this.formBuilder.group({
      model: this.model,
      price: this.price,
      brand: this.brand,
      photo: this.photo,
      date: this.date
    });
  }

  getCelulares() {
    this.dataService.getCelulares().subscribe(
      data => this.celulares = data,
      error => console.log(error),
      () => this.isLoading = false
    );
  }

  getCelular(celular) {
    this.dataService.getCelular(celular).subscribe(
            data => this.celular = data,
            error => console.log(error),
        () => this.isLoading = false
    );
  }

  inserirCelular() {
    this.dataService.inserir(this.inserirCelularForm.value).subscribe(
      res => {
        var newCelular = res.json();
        this.celulares.push(newCelular);
        this.inserirCelularForm.reset();
        this.sendInfoMsg("Celular inserido com sucesso.", "success");
      },
      error => console.log(error)
    );
  }

  sendInfoMsg(body, type, time = 3000) {
    this.infoMsg.body = body;
    this.infoMsg.type = type;
    window.setTimeout(() => this.infoMsg.body = "", time);
  }

}
