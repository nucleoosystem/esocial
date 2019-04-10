
package br.gov.esocial.servicos.empregador.consulta;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicoConsultarLoteEventos", targetNamespace = "http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0", wsdlLocation = "file:/C:/Users/Leandro%20Albanez/OneDrive%20-%20Atlantic%20Solutions/Documenta\u00e7\u00e3o%20Esocial/Pacote%20de%20Comunica\u00e7\u00e3o%20eSocial%20v1.4.1/WSDL/WsConsultarLoteEventos-v1_1_0.wsdl")
public class ServicoConsultarLoteEventos_Service
    extends Service
{

    private final static URL SERVICOCONSULTARLOTEEVENTOS_WSDL_LOCATION;
    private final static WebServiceException SERVICOCONSULTARLOTEEVENTOS_EXCEPTION;
    private final static QName SERVICOCONSULTARLOTEEVENTOS_QNAME = new QName("http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0", "ServicoConsultarLoteEventos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://webservices.producaorestrita.esocial.gov.br/servicos/empregador/consultarloteeventos/WsConsultarLoteEventos.svc?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICOCONSULTARLOTEEVENTOS_WSDL_LOCATION = url;
        SERVICOCONSULTARLOTEEVENTOS_EXCEPTION = e;
    }

    public ServicoConsultarLoteEventos_Service() {
        super(__getWsdlLocation(), SERVICOCONSULTARLOTEEVENTOS_QNAME);
    }

    public ServicoConsultarLoteEventos_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICOCONSULTARLOTEEVENTOS_QNAME, features);
    }

    public ServicoConsultarLoteEventos_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICOCONSULTARLOTEEVENTOS_QNAME);
    }

    public ServicoConsultarLoteEventos_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICOCONSULTARLOTEEVENTOS_QNAME, features);
    }

    public ServicoConsultarLoteEventos_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicoConsultarLoteEventos_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicoConsultarLoteEventos
     */
    @WebEndpoint(name = "Servicos.Empregador_ServicoConsultarLoteEventos")
    public ServicoConsultarLoteEventos getServicosEmpregadorServicoConsultarLoteEventos() {
        return super.getPort(new QName("http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0", "Servicos.Empregador_ServicoConsultarLoteEventos"), ServicoConsultarLoteEventos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicoConsultarLoteEventos
     */
    @WebEndpoint(name = "Servicos.Empregador_ServicoConsultarLoteEventos")
    public ServicoConsultarLoteEventos getServicosEmpregadorServicoConsultarLoteEventos(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.esocial.gov.br/servicos/empregador/lote/eventos/envio/consulta/retornoProcessamento/v1_1_0", "Servicos.Empregador_ServicoConsultarLoteEventos"), ServicoConsultarLoteEventos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICOCONSULTARLOTEEVENTOS_EXCEPTION!= null) {
            throw SERVICOCONSULTARLOTEEVENTOS_EXCEPTION;
        }
        return SERVICOCONSULTARLOTEEVENTOS_WSDL_LOCATION;
    }

}
