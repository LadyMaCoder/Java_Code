package chapter3;

public class StudentInfoBean 
{
	// 姓名 学号 语文 数学 英语
	private String name;
	
	private int id;
	
	private int chineseSorce;
	
	private int mathSorce;
	
	private int englishSorce;
	
	private int allSorce;
	
	
	
	public StudentInfoBean(String name, int id, int chineseSorce, int mathSorce, int englishSorce, int allSorce) {
		super();
		this.name = name;
		this.id = id;
		this.chineseSorce = chineseSorce;
		this.mathSorce = mathSorce;
		this.englishSorce = englishSorce;
		this.allSorce = allSorce;
	}

	/**
	 * @return the allSorce
	 */
	public int getAllSorce()
	{
		return allSorce;
	}

	/**
	 * @param allSorce the allSorce to set
	 */
	public void setAllSorce(int allSorce)
	{
		this.allSorce = allSorce;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	
	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	
	/**
	 * @return the chineseSorce
	 */
	public int getChineseSorce()
	{
		return chineseSorce;
	}
	
	/**
	 * @param chineseSorce
	 *            the chineseSorce to set
	 */
	public void setChineseSorce(int chineseSorce)
	{
		this.chineseSorce = chineseSorce;
	}
	
	/**
	 * @return the mathSorce
	 */
	public int getMathSorce()
	{
		return mathSorce;
	}
	
	/**
	 * @param mathSorce
	 *            the mathSorce to set
	 */
	public void setMathSorce(int mathSorce)
	{
		this.mathSorce = mathSorce;
	}
	
	/**
	 * @return the englishSorce
	 */
	public int getEnglishSorce()
	{
		return englishSorce;
	}
	
	/**
	 * @param englishSorce
	 *            the englishSorce to set
	 */
	public void setEnglishSorce(int englishSorce)
	{
		this.englishSorce = englishSorce;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentInfoBean other = (StudentInfoBean) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentInfoBean [name=" + name + ", id=" + id + ", chineseSorce=" + chineseSorce + ", mathSorce="
				+ mathSorce + ", englishSorce=" + englishSorce + ", allSorce=" + allSorce + "]";
	}
	
}
