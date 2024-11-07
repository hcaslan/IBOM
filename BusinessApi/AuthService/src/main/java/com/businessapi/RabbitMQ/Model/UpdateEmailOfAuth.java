package com.businessapi.RabbitMQ.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UpdateEmailOfAuth
{
    String email;
    Long authId;
}
