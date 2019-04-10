
package br.gov.esocial.servicos.empregador.envio;

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
@WebService(name = "ServicoEnviarLoteEventos", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/v1_1_0")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicoEnviarLoteEventos {


    /**
     * 
     * @param loteEventos
     * @return
     *     returns br.gov.esocial.servicos.empregador.lote.eventos.envio.v1_1_0.EnviarLoteEventosResponse.EnviarLoteEventosResult
     */
    @WebMethod(operationName = "EnviarLoteEventos", action = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/v1_1_0/ServicoEnviarLoteEventos/EnviarLoteEventos")
    @WebResult(name = "EnviarLoteEventosResult", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/v1_1_0")
    @RequestWrapper(localName = "EnviarLoteEventos", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/v1_1_0", className = "br.gov.esocial.servicos.empregador.lote.eventos.envio.v1_1_0.EnviarLoteEventos")
    @ResponseWrapper(localName = "EnviarLoteEventosResponse", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/v1_1_0", className = "br.gov.esocial.servicos.empregador.lote.eventos.envio.v1_1_0.EnviarLoteEventosResponse")
    public br.gov.esocial.servicos.empregador.envio.EnviarLoteEventosResponse.EnviarLoteEventosResult enviarLoteEventos(
        @WebParam(name = "loteEventos", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/v1_1_0")
        br.gov.esocial.servicos.empregador.envio.EnviarLoteEventos.LoteEventos loteEventos);

}