package loverbook;

public class Book 
{
	private String title; //도서 제목
	private String authors; //저자
	private String publisher; //출판사
	private String ISBN; //도서 번호
	private String availability; //대여가능 여부
	private String rentingstudent; //대여한 학생 정보

	//------------------------------------------------------------------------------
	//생성자 - Book을 생성한다. 
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
	// Book 정보를 반환한다.
	//------------------------------------------------------------------------------
	public String toString()
	{
		String description;
		description="<"+title+">"+"\n";
		description+="-저자: "+authors+"\n";
		description+="-출판사: "+publisher+"\n";
		description+="-도서번호: "+ISBN+"\n";
		description+="-대여가능 여부: "+availability+"\n";
		description+="-대여한 학생 정보: "+rentingstudent+"\n";
		return description;
	}
	
	//------------------------------------------------------------------------------
	//title을 반환한다.
	//------------------------------------------------------------------------------
	public String getTitle()
	{
		return title;
	}
	
	//------------------------------------------------------------------------------
	//authors를 반환한다.
	//------------------------------------------------------------------------------
	public String getAuthors()
	{
		return authors;
	}
	
	//------------------------------------------------------------------------------
	//publisher를 반환한다.
	//------------------------------------------------------------------------------
	public String getPublisher()
	{
		return publisher;
	}
	//------------------------------------------------------------------------------
	//ISBN을 반환한다.
	//------------------------------------------------------------------------------
	public String getISBN()
	{
		return ISBN;
	}
		
	//------------------------------------------------------------------------------
	//availability를 반환한다.
	//------------------------------------------------------------------------------
	public String getAvailability()
	{
		return availability;
	}
	
	//------------------------------------------------------------------------------
	//rentingstudent를 반환한다.
	//------------------------------------------------------------------------------
	public String getRentingstudent()
	{
		return rentingstudent;
	}
}
