
package training.ws.TeamWsServer.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "geTeamResponse", namespace = "http://TeamWsServer.ws.training/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geTeamResponse", namespace = "http://TeamWsServer.ws.training/")
public class GeTeamResponse {

    @XmlElement(name = "return", namespace = "")
    private training.ws.TeamWsServer.Team _return;

    /**
     * 
     * @return
     *     returns Team
     */
    public training.ws.TeamWsServer.Team getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(training.ws.TeamWsServer.Team _return) {
        this._return = _return;
    }

}
