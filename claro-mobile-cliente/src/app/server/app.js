var express = require('express');
var path = require('path');
var morgan = require('morgan'); // logger
var bodyParser = require('body-parser');

var app = express();
app.set('port', (process.env.PORT || 3000));

app.use('/', express.static(__dirname + '/../../dist'));
app.use('/', express.static(__dirname + '/../public'));

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));

app.use(morgan('dev'));


app.get('/*', function(req, res) {
  res.sendFile(path.join(__dirname,'/../../dist/index.html'));
});

app.listen(app.get('port'), function() {
  console.log('Claro mobile cliente listening on port '+app.get('port'));
});


module.exports = app;