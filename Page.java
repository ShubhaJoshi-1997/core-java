class Page{

public String pageType;
public int numberOfPages;

@Override
public String toString(){
	return "Page -[pageType = "+this.pageType+", numberOfPages = "+this.numberOfPages+"]";
}
}