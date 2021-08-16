package com.umesh.vmware.service;

import com.umesh.vmware.Type;
import com.umesh.vmware.dtos.AreaRequestDTO;
import com.umesh.vmware.dtos.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public class AreaCalServiceImpl implements AreaCalService{
    @Override
    public ResponseDto calArea(double radius) {
        return null;
    }

    @Override
    public ResponseDto calArea(int l, int b) {
        return null;
    }

    @Override
    public ResponseDto calArea(int radius) {
        return null;
    }

    @Override
    public ResponseDto area(AreaRequestDTO areaRequestDTO) {
        ResponseDto response = new ResponseDto();
        if (areaRequestDTO == null){
            //TODO: ada exception for empty or null
        }
        else if(areaRequestDTO.getType() == Type.CIRCLE) {
            if (areaRequestDTO.getRadius() >0){
                response.setArea(3.14* areaRequestDTO.getRadius() * areaRequestDTO.getRadius());
                response.setPos(areaRequestDTO.getPosition());
                //Todo: need to think about position

            }

        }else if(areaRequestDTO.getType() == Type.RECTANGLE){
            if (areaRequestDTO.getL() >0 && areaRequestDTO.getB()>0){

            }

        }else if(areaRequestDTO.getType() == Type.SQUARE){

        }else {
            //TODO: ada exception for  shape not define in system
        }
        return response;
    }
}
