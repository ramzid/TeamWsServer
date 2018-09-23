
package training.ws.TeamWsServer.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "geTeamsResponse", namespace = "http://TeamWsServer.ws.training/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geTeamsResponse", namespace = "http://TeamWsServer.ws.training/")
public class GeTeamsResponse {

    @XmlElement(name = "return", namespace = "")
    private List<training.ws.TeamWsServer.Team> _return;

    /**
     * 
     * @return
     *     returns List<Team>
     */
    public List<training.ws.TeamWsServer.Team> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<training.ws.TeamWsServer.Team> _return) {
        this._return = _return;
    }

}
