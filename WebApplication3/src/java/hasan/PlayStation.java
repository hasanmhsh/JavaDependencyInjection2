package hasan;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

@PlayStationQualifier
@ApplicationScoped
@Model
public class PlayStation implements VolumeAdjustable {

	private String deviceVolume;
	@Inject private National coo;
	
	
	@Override
	public String getDeviceVolume() {
		// TODO Auto-generated method stub
                deviceVolume="PSvol:77";
		return deviceVolume+coo.getCOO();
	}

	@Override
	public void setDeviceVolume(String deviceVolume) {
		// TODO Auto-generated method stub
		this.deviceVolume = deviceVolume;
	}

}
