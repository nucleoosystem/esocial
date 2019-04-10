
package br.gov.esocial.servicos.empregador.consulta;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicoConsultarLoteEventos", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicoConsultarLoteEventos {


    /**
     * 
     * @param consulta
     * @return
     *     returns br.gov.esocial.servicos.empregador.lote.eventos.envio.consulta.retornoprocessamento.v1_1_0.ConsultarLoteEventosResponse.ConsultarLoteEventosResult
     */
    @WebMethod(operationName = "ConsultarLoteEventos", action = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0/ServicoConsultarLoteEventos/ConsultarLoteEventos")
    @WebResult(name = "ConsultarLoteEventosResult", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0")
    @RequestWrapper(localName = "ConsultarLoteEventos", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0", className = "br.gov.esocial.servicos.empregador.lote.eventos.envio.consulta.retornoprocessamento.v1_1_0.ConsultarLoteEventos")
    @ResponseWrapper(localName = "ConsultarLoteEventosResponse", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0", className = "br.gov.esocial.servicos.empregador.lote.eventos.envio.consulta.retornoprocessamento.v1_1_0.ConsultarLoteEventosResponse")
    public br.gov.esocial.servicos.empregador.consulta.ConsultarLoteEventosResponse.ConsultarLoteEventosResult consultarLoteEventos(
        @WebParam(name = "consulta", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0")
        br.gov.esocial.servicos.empregador.consulta.ConsultarLoteEventos.Consulta consulta);

}
