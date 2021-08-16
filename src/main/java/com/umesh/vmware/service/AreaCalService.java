package com.umesh.vmware.service;

import com.umesh.vmware.dtos.AreaRequestDTO;
import com.umesh.vmware.dtos.ResponseDto;

public interface AreaCalService {

   ResponseDto calArea(double radius);

   ResponseDto calArea(int l, int b);

   ResponseDto calArea(int side);

   ResponseDto area(AreaRequestDTO areaRequestDTO);
}
