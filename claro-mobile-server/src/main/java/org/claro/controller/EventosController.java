package org.claro.controller;

//import org.claro.db.Evento;
//import org.claro.utils.DataUtil;
//import org.claro.utils.ErrorDetails;

//@RestController
//@RequestMapping("api/ponto")
public class EventosController {
	// @Autowired
	// private EventoMediator eventoMediator;
	//
	// @RequestMapping(path = "/eventos/colaborador/{id}/diario", method =
	// RequestMethod.GET)
	// public ResponseEntity<List<Evento>> obterEventosDiarioColaborador(
	// @PathVariable(value = "id") String id) {
	// return new ResponseEntity<List<Evento>>(getEventosColaboradorDia(id),
	// HttpStatus.OK);
	// }
	//
	// @RequestMapping(path = "/eventos/colaborador/{id}/mensal", method =
	// RequestMethod.GET)
	// public ResponseEntity<?> obterColaborador(
	// @PathVariable(value = "id") String id) {
	// try {
	// return new ResponseEntity<List<Evento>>(
	// getEventosColaboradorMensal(id), HttpStatus.OK);
	// } catch (Exception e) {
	// return new ResponseEntity<Object>(new ErrorDetails(
	// DataUtil.formatarDateTime(LocalDateTime.now()),
	// e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	// }
	// }
	//
	// private List<Evento> getEventosColaboradorDia(String idColaborador) {
	// return eventoMediator.buscarEventosDiarioColaborador(idColaborador);
	// }
	//
	// private List<Evento> getEventosColaboradorMensal(String idColaborador)
	// throws Exception {
	// return eventoMediator.buscarEventosMensalColaborador(idColaborador);
	// }
}
