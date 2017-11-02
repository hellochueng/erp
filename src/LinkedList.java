

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	Data first = null;
	int count = 0;
	List<String> l = new ArrayList<String>();
	//���ƶ���ṹ��
	public class Data{
		//�������е�����
		private Object obj;
		//ָ����һ���ڵ�
		private Data next=null;
		public Data(Object obj){
			this.obj = obj;
		}
	}

	//�����һ���ڵ�
	public void insertFirst(Object obj){
		Data data = new Data(obj);
		data.next = first;
		first = data;
	}
	
	
	
	//��ѯһ���ڵ�
	public Data find(Object obj){
		if(first==null){
			System.out.println("likedList is null");
			return null;
		}else{
			Data Data = first;
			while(Data!=null){
				if(Data.obj==obj){
					return Data;
				}
				Data = Data.next;
			}
			return null;
		}
	}
	
	public void insert(Object obj){
		Data data = new Data(obj);
		if(first==null){
			data.next = first;
			first = data;
			count++;
		}else{
			Data Data = first;
			while(Data!=null){
				if(Data.next==null){
					count++;
					Data.next=data;
					break;
				}
				Data = Data.next;
			}
		}
	}
	
	//ɾ��һ���ڵ�
	public void delete(Object obj){
		Data data = first;
		if(data!=null){
			if(first.obj==obj){
				count--;
				first = first.next;
			}else{
				while(data.next!=null){
					if(data.next.obj == obj){
						if(data.next.next!=null){
							data.next = data.next.next;
						}else{
							data.next =null;
						}
						count--;
						break;
					}
					data = data.next;
				}
			}
		}else{
			System.out.println("likedList is null");
		}
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		System.out.println(ll.count);
		ll.delete(1);
		System.out.println(ll.count);
	}
}
