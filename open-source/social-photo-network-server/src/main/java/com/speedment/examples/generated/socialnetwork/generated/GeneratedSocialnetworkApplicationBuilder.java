package com.speedment.examples.generated.socialnetwork.generated;

import com.speedment.common.injector.Injector;
import com.speedment.examples.generated.socialnetwork.SocialnetworkApplication;
import com.speedment.examples.generated.socialnetwork.SocialnetworkApplicationBuilder;
import com.speedment.examples.generated.socialnetwork.SocialnetworkApplicationImpl;
import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.image.ImageManagerImpl;
import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.image.ImageSqlAdapter;
import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.link.LinkManagerImpl;
import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.link.LinkSqlAdapter;
import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.user.UserManagerImpl;
import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.user.UserSqlAdapter;
import com.speedment.runtime.core.internal.AbstractApplicationBuilder;
import javax.annotation.Generated;

/**
 * A generated base {@link
 * com.speedment.runtime.core.internal.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named socialnetwork.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedSocialnetworkApplicationBuilder extends AbstractApplicationBuilder<SocialnetworkApplication, SocialnetworkApplicationBuilder> {
    
    protected GeneratedSocialnetworkApplicationBuilder() {
        super(SocialnetworkApplicationImpl.class, GeneratedSocialnetworkMetadata.class);
        withManager(ImageManagerImpl.class);
        withManager(LinkManagerImpl.class);
        withManager(UserManagerImpl.class);
        withComponent(ImageSqlAdapter.class);
        withComponent(LinkSqlAdapter.class);
        withComponent(UserSqlAdapter.class);
    }
    
    @Override
    public SocialnetworkApplication build(Injector injector) {
        return injector.getOrThrow(SocialnetworkApplication.class);
    }
}