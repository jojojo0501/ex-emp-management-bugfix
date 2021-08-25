package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@Size(min = 1, max = 50, message = "氏名を入力してください。（1文字以上50文字以内）")
	private String name;
	/** メールアドレス */
	@Size(min = 1, max = 50, message = "メールアドレスを入力してください。（1文字以上50文字以内）")
	@Email(message = "Emailの形式が不正です")
	private String mailAddress;
	/** パスワード */
	@Size(min = 1, max = 127, message = "パスワードを入力してください。（1文字以上50文字以内）")
	private String password;
	@Size(min = 1, max = 127, message = "確認用パスワードを入力してください。（1文字以上50文字以内）")
	/** 確認用パスワード */
	private String confirmPassword;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress the mailAddress to set
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}

}
