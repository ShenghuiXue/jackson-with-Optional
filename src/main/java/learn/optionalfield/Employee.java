package learn.optionalfield;

import java.util.Optional;

public class Employee {
	// Jackson does not fill the field if it is not provided. 
	// We can define the field to be Optional.empty(), if the field is not in the yaml/json file.
	// https://github.com/eugenp/tutorials/issues/7184
	private Optional<String> name = Optional.empty();
	private Optional<String> job = Optional.empty();
	private Optional<Integer> skill = Optional.empty();
	private Optional<Boolean> employed = Optional.empty();
	private Optional<Languages> languages = Optional.empty();
	private Optional<String> education = Optional.empty();
	/**
	 * @return the name
	 */
	public String getName() {
		return name.orElse(null);
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job.orElse("This field is not set ....");
	}
	/**
	 * @return the skill
	 */
	public int getSkill() {
		// return the integer in the yaml field
		// if the field is not exist, then return -1000
		return skill.orElse(-1000);
	}
	/**
	 * @return the employed
	 */
	public Optional<Boolean> getEmployed() {
		return employed;
	}
	/**
	 * @return the languages
	 */
	public Optional<Languages> getLanguages() {
		return languages;
	}
	/**
	 * @return the education
	 */
	public Optional<String> getEducation() {
		return education;
	}
}
