package hackerrank;

public class array {
	
	private int[] arrayOfInts;
	private int size = 0;	
	public array(){
		this.arrayOfInts = new int[0];
	}
	public array(int n){
		this.arrayOfInts = new int[n];
		this.size = n;
	}
	public void add(int n){
		try{ 
                    this.arrayOfInts[this.size] = n; 
			 
		}catch(ArrayIndexOutOfBoundsException e){
			int temp[] = new int [this.size];
			for(int i=this.size-1;i>=0;i--){
				 temp [i] = this.arrayOfInts[i];
			}
			this.arrayOfInts = new int[this.size+1];
			for(int i=0;i<this.size;i++){
				    this.arrayOfInts[i] = temp [i];
			}
			
		}finally{
                        this.arrayOfInts[this.size] = n; 
			this.size ++;
		}
	}
	public void add(int x,int n){
            try{ 
                this.size++;
                int counts =0;
                int temp[] = new int [this.size];
		for(int i=0;i<this.size;i++){
                    if(i != x){
                        temp[i] = this.arrayOfInts[counts];
                        counts++;
                    }    
                }    
                this.arrayOfInts = new int[this.size];
		for(int i=0;i<this.size;i++){
                    this.arrayOfInts[i] = temp [i];
		}        
                this.arrayOfInts[x] = n;
		
            }catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception thrown :"+e);
                this.size--;
            }
		
                
	}
	public void replace(int x,int n){
		try{
                    this.arrayOfInts[x] = n; 
			
		}catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Exception thrown :"+e);
		} 
	}
	public int get(int index){
		return this.arrayOfInts[index];
	}  
	public void remove(int index){
		for(int i=index;i<this.size-1;i++){
			this.arrayOfInts[i] = this.arrayOfInts[i+1];
		}
		this.size --;
	} 
	public boolean isEmpty(){
		if(this.size == 0){
			return true;
		}else{
			return false;
		}
		
	}
	public int size(){
		return this.size;
	}
	
	public boolean contains(int d){
		for(int i=0;i<this.size;i++){
			if(this.arrayOfInts[i] == d){
				return true;
			}
		}
		return false;
	}
	
	public void clear(){
		for(int i=0;i<this.size;i++){
			this.arrayOfInts[i] = 0;
		}
            this.size = 0;
	}
	
	public String toString(){
		String arr = "[";
		for(int i=0;i<this.size;i++){
			arr = arr+ Integer.toString(this.arrayOfInts[i])+",";
		}
                arr+="]";
		return arr;
	}
	public void trimToSize(int size){
            try{
            int temp[] = new int [size];
            for(int i=size-1;i>=0;i--){
		 temp [i] = this.arrayOfInts[i];
            }
            this.arrayOfInts = new int[size];
            for(int i=size-1;i>=0;i--){
                this.arrayOfInts[i] = temp [i];
            }
            this.size = size;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown :"+e);
            }
        }
        
	public static void main(String []args){
		array a = new array(10);
		array b = new array();
//		a.add(10);
//		a.add(11);
//		a.add(12);
		b.add(0);
		b.add(1);
		b.add(2);
		b.add(10);
		b.add(11);
		b.add(12);
		b.add(6,8);
		b.add(2,100);
		b.add(18,100);
		b.replace(13,200);
		b.remove(4);
		//b.clear();
		b.trimToSize(30);
		System.out.println("size= "+b.size());
		System.out.println("index = "+b.get(2)+	b.contains(11));
                System.out.println(b.toString());
	}

}
