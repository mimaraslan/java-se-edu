package com.mimaraslan.mapper;

import com.mimaraslan.dto.request.DoRegisterRequestDto;
import com.mimaraslan.model.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthMapper {
    IAuthMapper INSTANCE = Mappers.getMapper(IAuthMapper.class);
    Auth toAuth(final DoRegisterRequestDto dto);

}
