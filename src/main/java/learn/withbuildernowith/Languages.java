package learn.withbuildernowith;

import java.util.Optional;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = Languages.LanguagesBuilder.class)
public class Languages {
	private int perl;
	private int python;
	private int java;
	private int pascal;
	
	private Languages (LanguagesBuilder builder) {
		this.perl = builder.perl.orElse(-1000);
		this.python = builder.python.orElse(-1000);
		this.java = builder.java.orElse(-1000);
		this.pascal = builder.pascal.orElse(-1000);
	}
	
	/**
	 * @return the perl
	 */
	public int getPerl() {
		return perl;
	}
	/**
	 * @return the python
	 */
	public int getPython() {
		return python;
	}
	/**
	 * @return the java
	 */
	public int getJava() {
		return java;
	}
	/**
	 * @return the pascal
	 */
	public int getPascal() {
		return pascal;
	}
	
	@JsonPOJOBuilder (withPrefix = "")
	public static class LanguagesBuilder {
		private Optional<Integer> perl = Optional.empty();
		private Optional<Integer> python = Optional.empty();
		private Optional<Integer> java = Optional.empty();
		private Optional<Integer> pascal = Optional.empty();
		
		public LanguagesBuilder perl(Integer perl) {
			this.perl = Optional.ofNullable(perl);
			return this;
		}
		
		public LanguagesBuilder python(Integer python) {
			this.python = Optional.ofNullable(python);
			return this;
		}
		
		public LanguagesBuilder jave (Integer java) {
			this.java = Optional.ofNullable(java);
			return this;
		}
		
		public LanguagesBuilder pascal (Integer pascal) {
			this.pascal = Optional.ofNullable(pascal);
			return this;
		}
		
		public Languages build() {
			return new Languages(this);
		}
	}
}
