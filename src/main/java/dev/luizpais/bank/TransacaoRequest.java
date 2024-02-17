package dev.luizpais.bank;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public record TransacaoRequest(
        long valor,
        String descricao,
        String tipo) {
}
