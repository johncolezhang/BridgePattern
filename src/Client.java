
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image;//��������ͼƬ
		ImageImp imp;//ʵ����
		image = (Image)XMLUtil.getBean("image");
		imp = (ImageImp)XMLUtil.getBean("os");
		image.setImageImp(imp);
		image.parseFile("bilibili");
	}
}
