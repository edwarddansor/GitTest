
public class Recursion{
	public static void main(String[] args){

//8��7���Թ���0ͨ�У�1��ֹ
		int [][] map=new int [8][7];
		//�����н�ֹͨ��
for(int i=0;i<7;i++)
{
	map[0][i]=1;
	map[7][i]=1;
}


//�����н�ֹͨ��
for(int i=0;i<8;i++)
{
	map[i][0]=1;
	map[i][6]=1;
}
//�����Թ���
map[3][1]=1;
map[3][2]=1;
//��ӡ��ͼ
for(int i=0;i<map.length;i++){
	for(int j=0;j<map[i].length;j++){
		System.out.print(map[i][j]+" ");
	}

System.out.println();

}
//ʹ�ò�����·
T t1=new T();
t1.findWay(map,1,1);
System.out.println("\n�������");
for(int i=0;i<map.length;i++){
	for(int j=0;j<map[i].length;j++){
		System.out.print(map[i][j]+" ");
	}

System.out.println();

}

	}
}


class T{
	//ʹ�õݹ���ݽ��
	//����ҵ�����true������false;
	//�����ʼλ�ã�1��1��
	//0ͨ�У�1��ֹ��2�����ߣ�3��ʾ�߹�����ͨ
	//��map[6][5]=2ʱ˵���ҵ�·���Խ���
	//���ԣ���-��-��-��

	public boolean findWay(int[][] map,int i,int j ){
    //�ҵ�·
		if(map[6][5]==2){                          
			return true;
		}


	
	    else{
		     if(map[i][j] == 0){//������
			//�ٶ�������ͨ
			map[i][j]=2;
			//ʹ�ò�����֤
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