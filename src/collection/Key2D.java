package collection;


public class Key2D{
	private final String outer;
	  private final String inner;

	  public Key2D(String outer, String inner){
	    this.outer = outer;
	    this.inner = inner;
	  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inner == null) ? 0 : inner.hashCode());
		result = prime * result + ((outer == null) ? 0 : outer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key2D other = (Key2D) obj;
		if (inner == null) {
			if (other.inner != null)
				return false;
		} else if (!inner.equals(other.inner))
			return false;
		if (outer == null) {
			if (other.outer != null)
				return false;
		} else if (!outer.equals(other.outer))
			return false;
		return true;
	}
	   
	  
	}
