package org.claro.controller;

//import org.claro.db.Colaborador;

//@RestController
//@RequestMapping("api/ponto")
public class ColaboradorController {

	// @Autowired
	// private ColaboradorMediator colaboradorMediator;
	//
	// @Autowired
	// private EventoMediator eventoMediator;
	//
	// @RequestMapping(path = "/colaboradores", method = RequestMethod.GET)
	// public ResponseEntity<List<Colaborador>> obterColaboradores() {
	// return new ResponseEntity<List<Colaborador>>(getColaboradores(),
	// HttpStatus.OK);
	// }
	//
	// @RequestMapping(path = "/colaborador/{id}", method = RequestMethod.GET)
	// public ResponseEntity<Colaborador> obterColaborador(
	// @PathVariable(value = "id") String id) {
	// return new ResponseEntity<Colaborador>(getColaboradores().stream()
	// .filter(colaborador -> colaborador.getId().equals(id))
	// .findFirst().orElse(null), HttpStatus.OK);
	//
	// }
	//
	// @RequestMapping(path = "/colaboradores", method = RequestMethod.POST)
	// public ResponseEntity<String> pesquisarColaboradores(
	// @RequestBody Colaborador colaborador) {
	// return new ResponseEntity<String>("18", HttpStatus.OK);
	// }
	//
	// @RequestMapping(path = "/colaborador/{id}/registrar", method =
	// RequestMethod.PUT)
	// public ResponseEntity<Object> registrar(@PathVariable String id) {
	// try {
	// eventoMediator.registrar(id);
	// return new ResponseEntity<Object>("Ponto registrado com sucesso.",
	// HttpStatus.OK);
	// } catch (Exception e) {
	// return new ResponseEntity<Object>(new ErrorDetails(
	// DataUtil.formatarDateTime(LocalDateTime.now()),
	// e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	// }
	//
	// }
	//
	// @RequestMapping(path = "/colaborador/{id}/total-horas-dia", method =
	// RequestMethod.GET)
	// public ResponseEntity<ClockDetails> obterHorasDia(@PathVariable String
	// id) {
	// return new ResponseEntity<ClockDetails>(getTotalHorasDia(id),
	// HttpStatus.OK);
	// }
	//
	// @RequestMapping(path = "/colaborador/{id}/total-horas-mes", method =
	// RequestMethod.GET)
	// public ResponseEntity<ClockDetails> obterHorasMes(@PathVariable String
	// id) {
	// return new ResponseEntity<ClockDetails>(getTotalHorasMes(id),
	// HttpStatus.OK);
	// }
	//
	// private List<Colaborador> getColaboradores() {
	// return colaboradorMediator.obterTodos();
	// }
	//
	// private ClockDetails getTotalHorasDia(String colaboradorID) {
	// try {
	// return colaboradorMediator.obterHorasTrabalhadasDia(colaboradorID);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// return new ClockDetails();
	// }
	//
	// private ClockDetails getTotalHorasMes(String colaboradorID) {
	// try {
	// return colaboradorMediator.obterHorasTrabalhadasMes(colaboradorID);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	// return null;
	// }

}
