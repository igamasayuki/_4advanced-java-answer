package com.example.answer.ex_calendar;

import java.time.LocalDate;

public class ExCalendar2 {

	public static void main(String[] args) {
		int year = 2018;
		int month = 1;
		System.out.println(year + "�N"+ month + "���̃J�����_�[");
		System.out.println("��\t��\t��\t��\t��\t��\t�y");
		
		// �w�肳�ꂽ�N���̂P����ݒ�
		LocalDate localdate = LocalDate.of(year,month,1);
		
		// �P�������j����(1:���j���`7���j��)
		int firstWeekOfDay = localdate.getDayOfWeek().getValue();
		
		// �󔒂Ɂ�������
		for(int i = 0; i < firstWeekOfDay; i++) {
			System.out.print("��\t");
		}
		
		// ��T�ԃJ�E���^�[
		// �����l�́���ł����c��
		int weekCounter = 7 - firstWeekOfDay;
		
		// ���t�̓���
		for(int i = 1; i <= localdate.lengthOfMonth(); i++) { // lengthOfMonth() ���̌��̒��������߂�
			System.out.print(i + "\t");
			weekCounter--;
			if(weekCounter == 0) { // �P�T�Ԃ̏I���ɉ��s���J�E���^�[���Z�b�g
				System.out.println();
				weekCounter = 7;
			}
		}
		
		// �c��̋󔒂Ɂ���ł�
		for(int i = 0; i < weekCounter; i++) {
			System.out.print("��\t");
		}
		
	}

}
