package org.parchmentmc.feather.metadata;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.parchmentmc.feather.named.ImmutableNamed;
import org.parchmentmc.feather.named.Named;

public final class FieldMetadataBuilder implements FieldMetadata
{
    private Named owner = new ImmutableNamed();
    private Named name = new ImmutableNamed();
    private int   securitySpecification = 0;
    private Named descriptor = new ImmutableNamed();
    private Named signature = new ImmutableNamed();

    private FieldMetadataBuilder() {}

    public static FieldMetadataBuilder create() { return new FieldMetadataBuilder(); }

    public FieldMetadataBuilder withOwner(Named owner)
    {
        this.owner = owner;
        return this;
    }

    public FieldMetadataBuilder withName(Named name)
    {
        this.name = name;
        return this;
    }

    public FieldMetadataBuilder withSecuritySpecification(int securitySpecification)
    {
        this.securitySpecification = securitySpecification;
        return this;
    }

    public FieldMetadataBuilder withDescriptor(Named descriptor)
    {
        this.descriptor = descriptor;
        return this;
    }

    public FieldMetadataBuilder withSignature(Named signature)
    {
        this.signature = signature;
        return this;
    }

    @Override
    public @NonNull Named getOwner()
    {
        return owner;
    }

    @Override
    public @NonNull Named getName()
    {
        return name;
    }

    @Override
    public int getSecuritySpecification()
    {
        return securitySpecification;
    }

    @Override
    public @NonNull Named getDescriptor()
    {
        return descriptor;
    }

    @Override
    public @NonNull Named getSignature()
    {
        return signature;
    }

    public ImmutableFieldMetadata build() { return new ImmutableFieldMetadata(owner, name, securitySpecification, descriptor, signature); }
}
