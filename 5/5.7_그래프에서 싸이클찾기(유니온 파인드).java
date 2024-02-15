class Main {
    public int find(int[] parent, int u) {
        if(u == parent[u])
            return u;

        parent[u] = find(parent, parent[u]); //대표노드를 찾는 find 재귀함수
        return parent[u];
    }

    public boolean merge(int[] parent, int u, int v) {
        u = find(parent, u); //각 노드의 대표노드 find
        v = find(parent, v); 

        if(u == v) //[2]: 3 == [3]: 3 대표노드가 같으면 true
            return true;

        parent[u]=v; //[1]: 2 , [2]: 3 대표노드끼리 연결하기 union=merge
        return false;
    }

    public int solution(int n, int[][] connections) {
        int answer = 0;

        int[] parent = new int[n+1];
        for(int i = 1; i <= n; i++)
            parent[i]=i;

        for(int i = 0; i < connections.length; i++)
            if(merge(parent, connections[i][0], connections[i][1])) { 
                answer = i + 1; //count 0부터 시작했으니까 +1
                break; //true와 동시에 탈출
            }

        return answer;
    }

