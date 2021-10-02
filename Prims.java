class Mst{
	
	private static final int V=4;
	int minKey(int key[], Boolean mstSet[]){
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int i=0; i<V;i++){
			if(mstSet[i]==false && key[i]<min){
				min=key[i];
				min_index=i;
			}
		}
		return min_index;
	}
	void print(int p[],int g[][]){
		System.out.println("Edges: \tWeight:");
		for(int i=1;i<V;i++){
			System.out.println(p[i] +" - "+i+"\t"+g[i][p[i]]);
		}
	}
	void prim(int g[][]){
		int p[]=new int [V];
		int key[]=new int [V];
		Boolean mstSet[]=new Boolean [V];
		for(int i=0;i<V;i++){
			key[i]=Integer.MAX_VALUE;
			mstSet[i]=false;
		}
		key[0]=0;
		p[0]=-1;
		for(int count=0;count<V-1;count++){
			int a=minKey(key,mstSet);
			mstSet[a]=true;
			for(int i=0;i<V;i++){
				if(g[a][i]!=0 && mstSet[i]==false && g[a][i]<key[i]){
					p[i]=a;
					key[i]=g[a][i];
				}
			}
		}
		print(p,g);
	}
	
}

public class Prims {

	public static void main(String[] args) {
		Mst ob=new Mst();
		int g[][]=new int [][]{{0,2,0,6,0},
								{2,0,3,8,5},
								{0,3,0,0,9},
								{6,8,0,0,9}};
		ob.prim(g);
	
	}

}