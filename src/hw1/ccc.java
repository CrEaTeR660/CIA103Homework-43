package hw1;

public class ccc {
	public static void main(String[] args) {
		
		int ttlsecs = 256559, hrs = 24, mins = 60, secs = 60; 
		int daysec = hrs * mins * secs, hrssec = mins * secs; //一天幾秒鐘, 一小時幾秒鐘
	    int hrsleft = ttlsecs % daysec, minleft = hrsleft % hrssec, secleft = minleft % secs;//剩餘多少小時秒, 剩餘多少分鐘秒, 剩餘多少秒
	    	    
	    System.out.println("256559秒為" + (ttlsecs/daysec) + "天" + (hrsleft/hrssec) + "小時" + (minleft/secs) + "分" +secleft + "秒");
		
		
	
	}

}
