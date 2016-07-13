package spring;

public class Stock {
	private int id;
	private int CategoryId;
	private String stockCode;
	private String stockName;

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(int categoryId, String stockCode, String stockName) {
		super();
		CategoryId = categoryId;
		this.stockCode = stockCode;
		this.stockName = stockName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}
