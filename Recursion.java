
public class Recursion{
	public static void main(String[] args){

//8行7列迷宫；0通行，1禁止
		int [][] map=new int [8][7];
		//最外行禁止通行
for(int i=0;i<7;i++)
{
	map[0][i]=1;
	map[7][i]=1;
}


//最外列禁止通行
for(int i=0;i<8;i++)
{
	map[i][0]=1;
	map[i][6]=1;
}
//设置迷宫；
map[3][1]=1;
map[3][2]=1;
//打印地图
for(int i=0;i<map.length;i++){
	for(int j=0;j<map[i].length;j++){
		System.out.print(map[i][j]+" ");
	}

System.out.println();

}
//使用策略找路
T t1=new T();
t1.findWay(map,1,1);
System.out.println("\n结果如下");
for(int i=0;i<map.length;i++){
	for(int j=0;j<map[i].length;j++){
		System.out.print(map[i][j]+" ");
	}

System.out.println();

}

	}
}


class T{
	//使用递归回溯解决
	//如果找到返回true，否则false;
	//老鼠初始位置（1，1）
	//0通行；1禁止；2可以走；3表示走过但不通
	//当map[6][5]=2时说明找到路可以结束
	//策略：下-右-上-左

	public boolean findWay(int[][] map,int i,int j ){
    //找到路
		if(map[6][5]==2){                          
			return true;
		}


	
	    else{
		     if(map[i][j] == 0){//可以走
			//假定可以走通
			map[i][j]=2;
			//使用策略验证
			      if (findWay(map,i+1,j)){
				         return true;
			       }else if(findWay(map,i,j+1)){
				         return true;

			        }else if(findWay(map,i-1,j)){
			
				        return true;
			        }else if(findWay(map,i,j-1)){
			        	return true;
		                                     
		            }else{map[i][j]=3;
		                    return false;

		                }

	
		         }

             else {return false;
                   }
		
                }
}
}