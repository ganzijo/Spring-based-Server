package ganzijo.vo;

import java.util.ArrayList;
import java.util.List;

public class DataVO extends AbstractObject {

	private static final long serialVersionUID = -8865356049411666400L;
	private List<Data> data = new ArrayList<DataVO.Data>();
	public static class Data extends AbstractObject  {
		/**
		 * 
		 */
		private static final long serialVersionUID = 5128257266182502643L;
		private String deptno;
		private String dname;
		private String loc;

		public Data(String deptno, String dname, String loc) {
			super();
			this.deptno = deptno;
			this.dname = dname;
			this.loc = loc;
		}

		public Data() {
			super();
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Data [deptno=").append(deptno).append(", dname=")
					.append(dname).append(", loc=").append(loc).append("]");
			return builder.toString();
		}
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

}
