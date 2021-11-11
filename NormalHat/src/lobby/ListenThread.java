package lobby;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ListenThread extends Thread { // �������� ���� �޼��� �д� Thread
    Socket socket = null;

    public ListenThread(Socket socket) { // ������
        this.socket = socket; // �޾ƿ� Socket Parameter�� �ش� Ŭ���� Socket�� �ֱ�
    }

    public void run() {
        try {
            // InputStream - Server���� ���� �޼����� Ŭ���̾�Ʈ�� ������
            // socket�� InputStream ������ InputStream in�� ���� ��
            InputStream input = socket.getInputStream();
            // BufferedReader�� �� InputStream�� ��� ���
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            while(true) { // ���ѹݺ�
                System.out.println(reader.readLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}