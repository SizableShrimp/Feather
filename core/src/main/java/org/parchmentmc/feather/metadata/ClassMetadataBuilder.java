package org.parchmentmc.feather.metadata;

import com.google.common.collect.Lists;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.parchmentmc.feather.named.ImmutableNamed;
import org.parchmentmc.feather.named.Named;

import java.util.List;

public final class ClassMetadataBuilder implements ClassMetadata
{
    private Named                superName = new ImmutableNamed();
    private List<Named>          interfaces = Lists.newArrayList();
    private List<MethodMetadata> methods = Lists.newArrayList();
    private List<FieldMetadata>  fields = Lists.newArrayList();
    private List<ClassMetadata>  innerClasses = Lists.newArrayList();
    private Named                owner = new ImmutableNamed();
    private Named                name = new ImmutableNamed();
    private int                  securitySpecifications = 0;

    private ClassMetadataBuilder() {}

    public static ClassMetadataBuilder create() { return new ClassMetadataBuilder(); }

    public ClassMetadataBuilder withSuperName(Named superName)
    {
        this.superName = superName;
        return this;
    }

    public ClassMetadataBuilder withInterfaces(List<Named> interfaces)
    {
        this.interfaces = interfaces;
        return this;
    }

    public ClassMetadataBuilder withMethods(List<MethodMetadata> methods)
    {
        this.methods = methods;
        return this;
    }

    public ClassMetadataBuilder withFields(List<FieldMetadata> fields)
    {
        this.fields = fields;
        return this;
    }

    public ClassMetadataBuilder withInnerClasses(List<ClassMetadata> innerClasses)
    {
        this.innerClasses = innerClasses;
        return this;
    }

    public ClassMetadataBuilder withOwner(Named owner)
    {
        this.owner = owner;
        return this;
    }

    public ClassMetadataBuilder withName(Named name)
    {
        this.name = name;
        return this;
    }

    public ClassMetadataBuilder withSecuritySpecifications(int securitySpecifications)
    {
        this.securitySpecifications = securitySpecifications;
        return this;
    }


    @Override
    public @NonNull Named getSuperName()
    {
        return superName;
    }

    @Override
    public @NonNull List<Named> getInterfaces()
    {
        return interfaces;
    }

    @Override
    public @NonNull List<MethodMetadata> getMethods()
    {
        return methods;
    }

    @Override
    public @NonNull List<FieldMetadata> getFields()
    {
        return fields;
    }

    @Override
    public @NonNull List<ClassMetadata> getInnerClasses()
    {
        return innerClasses;
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
        return securitySpecifications;
    }

    public ImmutableClassMetadata build() { return new ImmutableClassMetadata(superName, interfaces, methods, fields, innerClasses, owner, name, securitySpecifications); }
}
