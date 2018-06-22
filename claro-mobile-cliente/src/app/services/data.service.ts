import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { BehaviorSubject } from 'rxjs/BehaviorSubject';

import 'rxjs/add/operator/map';

@Injectable()
export class DataService {

  private headers = new Headers({ 'Content-Type': 'application/json', 'charset': 'UTF-8' });
  private options = new RequestOptions({ headers: this.headers });
  private baseUrl: string;

  constructor(private http: Http) {
    this.baseUrl = 'http://localhot:8080';
  }

  getCelulares() {
    return this.http.get(`${this.baseUrl}/claro/mobile`).map(res => res.json());
  }

  inserir(celular) {
    return this.http.post(`${this.baseUrl}/claro/mobile`, JSON.stringify(celular), this.options);
  }

  getCelular(code: string) {
    return this.http.get(`${this.baseUrl}/claro/mobile/${code}`, JSON.stringify(celular), this.options);
  }
}
