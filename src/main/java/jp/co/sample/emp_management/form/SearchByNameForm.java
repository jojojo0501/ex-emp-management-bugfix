package jp.co.sample.emp_management.form;

/**
 * 従業員名前検索時に使用するフォーム
 * @author kanekojota
 *
 */
public class SearchByNameForm {
	/** 名前*/
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "searchByNameForm [name=" + name + "]";
	}
}
