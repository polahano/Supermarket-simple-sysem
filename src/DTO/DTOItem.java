package DTO;

public class DTOItem {
	
	private String  barcode, name, manufacturerName;
	private float buyPrice, sellPrice;
	private int quantity;
        private DTOCategory cat;
	

	
	
	public int getQuantity() {
		return quantity;
	}

        
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getBarcode() {
		return barcode;
	}


	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getManufacturerName() {
		return manufacturerName;
	}


	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}


	public float getBuyPrice() {
		return buyPrice;
	}


	public void setBuyPrice(float buyPrice) {
		this.buyPrice = buyPrice;
	}


	public float getSellPrice() {
		return sellPrice;
	}


	public void setSellPrice(float sellPrice) {
		this.sellPrice = sellPrice;
	}


	@Override
	public String toString() {
		return  this.getBarcode() +  this.getName() + this.getManufacturerName() + this.getBuyPrice() + this.getSellPrice() + "/n";
	}

    public DTOCategory getCategory() {
        return cat;
    }

    public void setCategory(DTOCategory cat) {
        this.cat = cat;
    }
        

}
