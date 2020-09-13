import { TestBed, inject } from '@angular/core/testing';

import { GetFeedsService } from './get-feeds.service';

describe('GetFeedsService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [GetFeedsService]
    });
  });

  it('should be created', inject([GetFeedsService], (service: GetFeedsService) => {
    expect(service).toBeTruthy();
  }));
});
