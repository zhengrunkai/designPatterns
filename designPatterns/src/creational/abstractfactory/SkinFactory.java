package creational.abstractfactory;

/**
 * SkinFactory������Ƥ�������ӿڣ��䵱���󹤳�
 */
public interface SkinFactory {

	public Button createButton();

	public TextField createTextField();

	public ComboBox createComboBox();

}