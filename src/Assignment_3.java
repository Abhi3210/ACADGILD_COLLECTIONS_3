import java.util.*;
class HDTV{
	String brandName;
	int size;
	public HDTV(String brandName,int size ){
		this.brandName=brandName;
		this.size=size;
	}
}

class SizeComparator implements Comparator<HDTV>{
	public int compare(HDTV h1,HDTV h2){
		if(h1.size==h2.size)
			return 0;
		else if(h1.size>h2.size)
			return 1;
		else
			return -1;
	}
}
public class Assignment_3 {
       public static void main(String args[]){
    	   ArrayList<HDTV> list=new ArrayList<HDTV>();
    	   HDTV hd1=new HDTV("SITI",100);
    	   HDTV hd2=new HDTV("TATASKY",101);
    	   HDTV hd3=new HDTV("VODAFONE",102);
    	   list.add(hd1);
    	   list.add(hd2);
    	   list.add(hd3);
     System.out.println("Sorting by size ...");	   
     Collections.sort(list,new SizeComparator());
     for(HDTV tv:list){
    	 System.out.println(tv.brandName+" "+tv.size);
     }
       }
}
