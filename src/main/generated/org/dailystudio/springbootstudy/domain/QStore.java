package org.dailystudio.springbootstudy.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStore is a Querydsl query type for Store
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStore extends EntityPathBase<Store> {

    private static final long serialVersionUID = 850959364L;

    public static final QStore store = new QStore("store");

    public final ListPath<Clerk, QClerk> clerks = this.<Clerk, QClerk>createList("clerks", Clerk.class, QClerk.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public QStore(String variable) {
        super(Store.class, forVariable(variable));
    }

    public QStore(Path<? extends Store> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStore(PathMetadata metadata) {
        super(Store.class, metadata);
    }

}

