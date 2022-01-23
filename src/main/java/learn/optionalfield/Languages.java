package learn.optionalfield;

import java.util.Optional;

public class Languages {
	private Optional<Integer> perl = Optional.empty();
	private Optional<Integer> python = Optional.empty();
	private Optional<Integer> java = Optional.empty();
	private Optional<Integer> pascal = Optional.empty();
	
	/**
	 * @return the perl
	 */
	public Optional<Integer> getPerl() {
		return perl;
	}
	/**
	 * @return the python
	 */
	public Optional<Integer> getPython() {
		return python;
	}
	/**
	 * @return the java
	 */
	public Optional<Integer> getJava() {
		return java;
	}
	/**
	 * @return the pascal
	 */
	public Optional<Integer> getPascal() {
		return pascal;
	}
}
