package vn.com.acb.vdc.common;

import java.io.Serializable;

import org.joda.time.DateTime;

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
		this.time = new DateTime().toString();
		if (redisTook != null && redisTook.length > 0) {
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
		this.time = new DateTime().toString();
	}
	
	public APIResponse(APIResponseBuilder builder) {
		
		this.time = builder.getTime();
		this.codeStatus = builder.getCodeStatus();
		this.messageStatus = builder.getMessageStatus();
		this.description = builder.getDescription();
		this.took = builder.getTook();
		this.data = builder.getData();
		this.redisTook = builder.getRedisTook();
	}

	@Setter
	@Getter
	public static class APIResponseBuilder {

		// builder code
		private String time;
		private int codeStatus;
		private String messageStatus;
		private String description;
		private long took;
		private Object data;
		private long redisTook;
		
		
		public APIResponseBuilder(String time) {
			
			this.time = time;
		}

		public APIResponseBuilder withCodeStatus(int codeStatus) {
			
			this.codeStatus = codeStatus;
			return this;
		}
		
		public APIResponseBuilder withTime(String time) {
			
			this.time = time;
			return this;
		}
		
		public APIResponseBuilder withMessageStatus(String messageStatus) {
			
			this.messageStatus = messageStatus;
			return this;
		}
		
		public APIResponseBuilder withDescription(String description) {
			
			this.description = description;
			return this;
		}
		
		public APIResponseBuilder withTook(long took) {
			
			this.took = took;
			return this;
		}
		
		public APIResponseBuilder withData(Object data) {
			
			this.data = data;
			return this;
		}
		
		public APIResponseBuilder wihtRedisTook(long redisTook) {
			
			this.redisTook = redisTook;
			return this;
		}
		
		public APIResponse build() {
			
			return new APIResponse(this);
		}
	}
}
