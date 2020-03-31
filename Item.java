class Item {
	int id;
	String name;
	double price;
        char tax;

        public Item(int id,String name,double price,char tax)
	{
	    this.id=id;
	    this.name = name;
	    this.price = price;
	    this.tax=tax;
	}
	void setID(int id)
	{
		this.id=id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setPrice(double price)
	{
		this.price=price;
	}
	void setTax(char tax)
	{
		this.tax=tax;
	}
	int getID()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	double getPrice()
	{
		return price;
	}
	char getTax()
	{
		return tax;
	}
	double taxReturn()
	{
		double taxForItem;
		if(tax=='A')
		{
			taxForItem = price*0.15;
			return taxForItem*0.15;
		}
		else if(tax=='?')
		{
			taxForItem = price*0.05;
			return taxForItem*0.15;
		}
		else
		{
			return price*0.15;
		}
	}
	
	
}
}
