package loverbook;

public class Book 
{
	private String title; //���� ����
	private String authors; //����
	private String publisher; //���ǻ�
	private String ISBN; //���� ��ȣ
	private String availability; //�뿩���� ����
	private String rentingstudent; //�뿩�� �л� ����

	//------------------------------------------------------------------------------
	//������ - Book�� �����Ѵ�. 
	//------------------------------------------------------------------------------
	public Book(String title,String authors,String publisher,String ISBN,String availability,String rentingstudent)
	{
		this.title=title;
		this.authors=authors;
		this.publisher=publisher;
		this.ISBN=ISBN;
		this.availability=availability;
		this.rentingstudent=rentingstudent;
	}
	
	//------------------------------------------------------------------------------
	// Book ������ ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	public String toString()
	{
		String description;
		description="<"+title+">"+"\n";
		description+="-����: "+authors+"\n";
		description+="-���ǻ�: "+publisher+"\n";
		description+="-������ȣ: "+ISBN+"\n";
		description+="-�뿩���� ����: "+availability+"\n";
		description+="-�뿩�� �л� ����: "+rentingstudent+"\n";
		return description;
	}
	
	//------------------------------------------------------------------------------
	//title�� ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	public String getTitle()
	{
		return title;
	}
	
	//------------------------------------------------------------------------------
	//authors�� ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	public String getAuthors()
	{
		return authors;
	}
	
	//------------------------------------------------------------------------------
	//publisher�� ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	public String getPublisher()
	{
		return publisher;
	}
	//------------------------------------------------------------------------------
	//ISBN�� ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	public String getISBN()
	{
		return ISBN;
	}
		
	//------------------------------------------------------------------------------
	//availability�� ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	public String getAvailability()
	{
		return availability;
	}
	
	//------------------------------------------------------------------------------
	//rentingstudent�� ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	public String getRentingstudent()
	{
		return rentingstudent;
	}
}
