package interfaceDemo;

public class Invoice implements Payable {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String nu,String des,int count,double cost)
	{
		partNumber=nu;
		partDescription=des;
		setQuantity(count);
		setPricePerItem(cost);
	}
	
	public void setQuantity(int count)
	{
		quantity=count;
	}
	
	public int getQuantity()
	{
		return quantity;
		
	}
	public void setPricePerItem(double cost)
	{
		pricePerItem=cost;
	}
	
	public double getPricePerItem()
	{
		return pricePerItem;
	}
	
	@Override
	public double getPayment()
	{
		return getQuantity()*getPricePerItem();
	}
	
	@Override
	public String toString()
	{
		return String.format("invoice:\npartnumber: %s (%s)\nprice per item:%d\n:$%.2f ",partNumber,partDescription,getQuantity(),getPricePerItem());
	}
}
