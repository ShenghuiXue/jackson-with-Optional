package learn.withbuilder;

public class Employee {
	private String name;
	private String job;
	private int skill;
	private boolean employed;
	private Languages languages;
	private String education;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @return the skill
	 */
	public int getSkill() {
		return skill;
	}
	/**
	 * @return the employed
	 */
	public boolean isEmployed() {
		return employed;
	}
	
	
	/**
	 * @return the languages
	 */
	public Languages getLanguages() {
		return languages;
	}
	
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
}
