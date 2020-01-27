package hasan;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface VolumeAdjustable {
	public static int deviceID=1;
	public String getDeviceVolume();
	public void setDeviceVolume(String deviceVolume);
}
