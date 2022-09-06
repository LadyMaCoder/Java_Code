package chapter5;

import java.util.HashSet;
import java.util.Set;

public class Demo4 {
		public static void main(String[] args) {
			Voter Tom=new Voter("Tom");
			Voter Jack=new Voter("Jack");
			Voter Mike=new Voter("Mike");
			Tom.vote("是");
			Tom.vote("是");
			Jack.vote("是");
			Mike.vote("是");
			Voter.show();
		}
	}

	class Voter{
		private static int MAX_VOTERS = 100;
		private static int count;//投票次数
		private static Set<Voter> voterSet = new HashSet<Voter>(); //存放以投过的学生
		private String name;
		private String advice;//投票意见
		public Voter(String name) {
			this.name = name;
		}
		//投票
		public void vote(String advice) {
			if (count==MAX_VOTERS) {
				System.out.println("投票结束。");
				return;
			}
			if (!voterSet.contains(this)) { 
				this.advice = advice;
				count++;
				voterSet.add(this);
				System.out.println(name + " 感谢你的投票。");
		
			}else {
				System.out.println(name + ",请勿重复投票。");
			}
		}
		public static void show( ) {
			System.out.println("当前投票数为:"+count);
			System.out.println("参与投票的学生和结果如下:");
			for (Voter voter:voterSet) {
				System.out.println(voter.name+" 意见  "+voter.advice);
			}
		}
	}
