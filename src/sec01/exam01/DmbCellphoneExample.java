package sec01.exam01;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		//��ü ����
		DmbCellPhone dmbCellPhone=new DmbCellPhone("�ڹ���","����",10);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: "+ dmbCellPhone.model);
		System.out.println("����: "+dmbCellPhone.color);
		
		System.out.println("ä��: "+dmbCellPhone.channel);
		
		
		dmbCellPhone.PowerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������.");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		

	}

}
