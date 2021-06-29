package acb;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author vu
 */
@Getter
@Setter
@NoArgsConstructor
public class APIResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String time;
    private int codeStatus;
    private String messageStatus;
    private String description;
    private long took;
    private Object data;
    private long redisTook;
    
    public APIResponse(int codeStatus, String messageStatus, String description, long took, long... redisTook) {
        super();
        this.codeStatus = codeStatus;
        this.messageStatus = messageStatus;
        this.description = description;
        this.took = took;
//        this.time = new DateTime().toString();
        if(redisTook != null && redisTook.length > 0) {
        	this.redisTook = redisTook[0];
        }
    }

    public APIResponse(int codeStatus, String messageStatus, String description, long took, Object data) {
        super();
        this.codeStatus = codeStatus;
        this.messageStatus = messageStatus;
        this.description = description;
        this.took = took;
        this.data = data;
//        this.time = new DateTime().toString();
    }

}
