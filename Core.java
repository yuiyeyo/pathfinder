import java.util.*;

class Core
{
    private Random wght = new Random(); //instance of random class
    private int wghtupperbound = 4;
    public ArrayList<Edge> edgess;
    public int awal;
    public int akhir;
    public int sar;
    public int vict;
    //public String s="";
    public int[] grd=
    {
      wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound),
      wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound),
      wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound),
      wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound),
      wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound),wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound), wght.nextInt(wghtupperbound),
      wght.nextInt(wghtupperbound)
    };
    public int getweight(int nnn)
    {
        return grd[nnn];
    }
    public int getsar()
    {
        return sar;
    }
    public int getvict()
    {
        return vict;
    }
    private void getRoute(int[] prev, int i, List<Integer> route)
    {
        if (i >= 1)
        {
            getRoute(prev, prev[i], route);
            route.add(i+1);
        }
    }
 
    // Run Dijkstra’s algorithm on a given graph
    public String findShortestPaths(Graph graph, int source, int n, int end)
    {
        String s = "";
        // create a min-heap and push source node having distance 0
        PriorityQueue<Node> minHeap;
        minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        minHeap.add(new Node(source, 0));
 
        // set initial distance from the source to `v` as infinity
        List<Integer> dist;
        dist = new ArrayList<>(Collections.nCopies(n, Integer.MAX_VALUE));
 
        // distance from the source to itself is zero
        dist.set(source, 0);
 
        // boolean array to track vertices for which minimum
        // cost is already found
        boolean[] done = new boolean[n];
        done[source] = true;
 
        // stores predecessor of a vertex (to a print path)
        int[] prev = new int[n];
        prev[source] = -1;
 
        // run till min-heap is empty
        while (!minHeap.isEmpty())
        {
            // Remove and return the best vertex
            Node node = minHeap.poll();
 
            // get the vertex number
            int u = node.vertex;
 
            // do for each neighbor `v` of `u`
            for (Edge edge: graph.adjList.get(u))
            {
                int v = edge.dest;
                int weight = edge.weight;
 
                // Relaxation step
                if (!done[v] && (dist.get(u) + weight) < dist.get(v))
                {
                    dist.set(v, dist.get(u) + weight);
                    prev[v] = u;
                    minHeap.add(new Node(v, dist.get(v)));
                }
            }
 
            // mark vertex `u` as done so it will not get picked up again
            done[u] = true;
        }
 
        List<Integer> route = new ArrayList<>();
        s = " ";

        for (int i = 0; i < n; i++)
        {
            if (i != source && dist.get(i) != Integer.MAX_VALUE)
            {
                getRoute(prev, i, route);
                if(i==end)
                {
                //s = new String ("Path (%d -> %d): Minimum cost = %d, Route = %s\n", source+1, i+1, dist.get(i), route)();
                s= "The route will be " + route.toString();
                break;
                }
                route.clear();
            }
        }
        return s;
    }

    public void gen()
    {
       // initialize edges as per the above diagram
        // (u, v, w) represent edge from vertex `u` to vertex `v` having weight `w`
        Random sarr = new Random(); //instance of random class
    int victupperbound = 25;
    int[] luar ={0,1,2,3,4,5,9,10,14,15,19,20,21,22,23,24};
    Random victt = new Random(); //instance of random class
    int sarupperbound = 16;
    sar = luar[sarr.nextInt(sarupperbound)];
    vict = sar;
    
   
    while(vict==sar)
      {
        vict = victt.nextInt(victupperbound);
      }
      awal=Math.min(vict,sar);
      akhir=Math.max(vict, sar);
      grd[sar]=0;
      grd [vict]=0;
    int m=0;
    for (int o=0;o<5;o++)
    {
      for (int p=0;p<5;p++)
      {
        if(sar==m)
        {
        System.out.print("S ");
        }
          else if(vict==m)
          {
            System.out.print("V ");
          }
          else
          {
            System.out.print(grd[m]+" ");
          }
          
          m++;
        }
        System.out.print("\n");
      }
      int nn=0;
      edgess = new ArrayList<Edge>();
      for (int i=1;i<=5;i++)
      {
        for (int j=1;j<=5;j++)
        {
            if(j!=1)
            {
              edgess.add(new Edge(nn, nn-1, grd[nn]));
            }
            if(j!=5)
            {
              edgess.add(new Edge(nn, nn+1, grd[nn]));
            }
            if(i!=1)
            {
              edgess.add(new Edge(nn, nn-5, grd[nn]));
            }
            if (i!=5)
            {
              edgess.add(new Edge(nn, nn+5, grd[nn]));
            }
            nn++;
        }
      }
    }
    private String rute;

    public String run()
    {
        // construct graph
        Graph graph = new Graph(edgess, 26);
        rute = findShortestPaths(graph, awal, 26, akhir);
        return rute;
      
    }
}