//dfs
import java.util.*;
import java.io.*;

class xy{ //xy좌표 저장 클래스
	int x;
	int y;
	
	public xy(int x,int y) {
		this.x= x;
		this.y =y;
	}
}

public class Answer1 {
	static int node[][]; // 2차원 배열
	static int check[][]; // 2차원 방문여부 배열
	static int cnt =1; // 1로 초기화
	static int n,m;
	
	public static void bfs(int a,int b) { 
		Queue<xy> queue = new LinkedList<>(); 
		a-=1;
		b-=1;
		check[a][b]= cnt; // 초기 cnt변수 값을 방문배열에서 시작점에 저장한다.
		
		queue.offer(new xy(a,b)); // 시작점의 객체를 큐에 삽입
		while(!queue.isEmpty()) { // 이제 큐가 공백이 될 때 까지 반복한다.
			int x = queue.peek().x; // 큐에 저장되어 있는 객체에서 x,y좌표를 저장
			int y = queue.peek().y;
			queue.poll(); 

					if(y<node[x].length-1 && node[x][y]==1&&node[x][y+1]==1 && check[x][y+1]==0) {
						check[x][y+1]=check[x][y]+1; // 현재 점이 가지고 있는 경로값을 인접한 점의 방문배열에 저장 
						queue.offer(new xy(x,y+1)); // 인접한 점을 큐에 넣어준다.
					}
					 if(x<node.length-1 && node[x][y]==1&&node[x+1][y]==1 && check[x+1][y]==0) {
						check[x+1][y]=check[x][y]+1;
						
						queue.offer(new xy(x+1,y));		
					}  if(x>0&&node[x][y]==1&&node[x-1][y]==1 && check[x-1][y]==0) {
						check[x-1][y]=check[x][y]+1;
						
						queue.offer(new xy(x-1,y));					
					}
					 if(y>0&&node[x][y]==1&&node[x][y-1]==1 && check[x][y-1]==0) {
						check[x][y-1]=check[x][y]+1;
						queue.offer(new xy(x,y-1));
					}	 
					
				}

	}
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		 n = sc.nextInt();
		 m = sc.nextInt();
		node = new int [n][m];
		check = new int[n][m];
		for(int i=0;i<n;i++) { // 줄단위로 입력이 이루어질 때 값을 저장하는 방식
			String row = sc.next();
			for(int j=0;j<m;j++) {
				
				node[i][j] = row.charAt(j)-'0';
			}
		}
		
		bfs(1,1); // 시작점 전달
		
		System.out.println(check[n-1][m-1]); 
	}
	
}